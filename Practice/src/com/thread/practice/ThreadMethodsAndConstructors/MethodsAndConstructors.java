package com.thread.practice.ThreadMethodsAndConstructors;

public class MethodsAndConstructors extends RunnableImplements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*    ============>Constructotrs<================
			
		1. Thread();
		2. Thread(Runnable target);
		3. Thread(String name);
		4. Thread(Runnable target,String name);
		5. Thread(ThreadGroup tg,Runnable target)
		6. Thread(ThreadGroup tg,String name)
		7. Thread(ThreadGroup tg,Runnable target,String name)
		8. Thread(ThreadGroup tg,Runnable target,String name,long stackSize)

			============>Methods<================
			
		1.run()
		2.start()
		3.currentThread(); => static method
		4.isAlive() =>either live or not
		5. getName(),setName(String name)
		6.isDaemon(), setDaemon(boolean b);
		7.getPriority() , setPriority(int pv);
		8.sleep() , yield(), join()==>[stops the execution of thread]
		9. suspend() resume(),stop() destroy() =>[stops the execution of thread but depreciated from java]
		10. intrupt(),isInteruppeted, ()interupted()
		
		
		*/
		System.out.println("main thread :: "+Thread.currentThread().getName());
		Thread.currentThread().setName("sr_akhtar");
		System.out.println("main thread changed name :: "+Thread.currentThread().getName());
		//System.out.println(10/0);

		
		MethodsAndConstructors MC = new MethodsAndConstructors();
		Thread th  = new Thread(MC,"methodConstructotr");
		th.start();

	}

}
